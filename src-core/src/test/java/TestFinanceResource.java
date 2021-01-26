import com.huutran.financetrawcker.core.resource.BaseFinanceResource;
import com.huutran.financetrawcker.core.resource.FinanceResource;
import com.huutran.financetrawcker.core.resource.MoneyResource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


public class TestFinanceResource {


    @Test
    public void testCreateNewAccountFromResource() {
        MoneyResource resource = new MoneyResource(BigDecimal.valueOf(1000000));
        FinanceResource accountResource = resource.addRelatedAccount(BigDecimal.valueOf(100000));
        BigDecimal totalAmount = ((BaseFinanceResource) accountResource).getTotalAmount();
        BigDecimal remain = resource.getTotalAmount();
        assertEquals(totalAmount, BigDecimal.valueOf(100000));
        assertEquals(remain, BigDecimal.valueOf(900000));
    }
}
