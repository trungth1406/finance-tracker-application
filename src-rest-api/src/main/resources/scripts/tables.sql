

create schema  FINANCETRACKER;

create table FINANCETRACKER.MONEY_RESOURCE
(
    ID BIGINT auto_increment,
    NAME VARCHAR(500) not null,
    TOTAL_AMOUNT DECIMAL not null,
    constraint MONEY_RESOURCE_PK
        primary key (ID)
);


create table FINANCETRACKER.ACCOUNT
(
    ID BIGINT auto_increment
        constraint ACCOUNT_PK
        unique,
    NAME VARCHAR2(500) not null,
    TOTAL_AMOUNT DECIMAL not null,
    FK_RESOURCE BIGINT not null,
    constraint FK_RESOURCE
        foreign key (FK_RESOURCE) references MONEY_RESOURCE (ID)
            on update cascade on delete cascade
);




create table FINANCETRACKER.TRANSACTION
(
    ID BIGINT auto_increment,
    DESCRIPTION VARCHAR2(1000),
    AMOUNT DECIMAL not null,
    DATE_OF_EXECUTION DATETIME not null,
    FK_RESOURCE BIGINT,
    FK_ACCOUNT BIGINT,
    TRANSACTION_TYPE VARCHAR(10) not null,
    constraint TRANSACTION_PK
        primary key (ID),
    constraint FK_ACCOUNT
        foreign key (FK_ACCOUNT) references ACCOUNT (ID),
    constraint FK_TRANS_RESOURCE
        foreign key (FK_RESOURCE) references MONEY_RESOURCE (ID)
);



