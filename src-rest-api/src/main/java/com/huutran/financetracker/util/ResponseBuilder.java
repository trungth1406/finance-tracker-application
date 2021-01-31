package com.huutran.financetracker.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ResponseBuilder<ResponseEntity> {

    private Class<?> target;

    public ResponseBuilder(Class<?> responseEntity) {
        this.target = responseEntity;

    }

    public ResponseEntity convertFrom(Object srcModel) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Field[] persistenceFields = this.target.getDeclaredFields();
        Field[] responseFields = srcModel.getClass().getDeclaredFields();
        Object targetObject = this.target.getDeclaredConstructor().newInstance();
        for (Field field : persistenceFields) {
            for (Field resField : responseFields) {
                String responseName = resField.getName();
                String persistName = field.getName();
                if (responseName.equals(persistName)) {
                    exchangeValue(field, resField, srcModel, targetObject);
                    break;
                } else {
                    int longestCount = lcs(responseName, persistName);
                    if (longestCount == persistName.length() - 2) {
                        exchangeValue(field, resField, srcModel, targetObject);
                        break;
                    }
                }
            }

        }
        return (ResponseEntity) targetObject;
    }

    private static void exchangeValue(Field field, Field targetField, Object resField, Object targetObject) {
        try {
            field.setAccessible(true);
            Object value = field.get(resField);
            targetField.set(targetObject,value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static int lcs(String first, String second) {
        int[][] count = new int[first.length() + 1][second.length() + 1];
        for (int i = 0; i < first.length(); i++) {
            for (int j = 0; j < second.length(); j++) {
                if (i == 0 || j == 0) {
                    count[i][j] = 0;
                } else if (first.charAt(i) == second.charAt(i)) {
                    count[i][j] = count[i][j] + 1;
                } else {
                    count[i][j] = Math.max(count[i + 1][j], count[i][j + 1]);
                }
            }
        }

        return count[first.length()][second.length()];
    }
}
