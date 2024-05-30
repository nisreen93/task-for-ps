/*import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import com.demo.dao.DealDao;
import com.demo.model.Deal;
import com.demo.service.DealService;

@SpringBootTest
@ActiveProfiles("test")
@TestPropertySource(locations = "classpath:application-test.properties")
public class FxDealsAnalyzerApplicationTests {

    @Autowired
    private DealService service;

    @Autowired
    private DealDao repository;

    @Test
    public void testSaveDeal_Success() {
        Deal deal = new Deal();
        deal.setDealId(UUID.randomUUID());
        deal.setFromCurrencyCode("USD");
        deal.setToCurrencyCode("EUR");
        deal.setDealTimestamp(LocalDateTime.now());
        deal.setDealAmount(BigDecimal.valueOf(1000));

        Deal savedDeal = service.saveDeal(deal);
        Assertions.assertNotNull(savedDeal);
        Assertions.assertEquals(deal.getDealId(), savedDeal.getDealId());
    }

    @Test
    public void testSaveDeal_Duplicate() {
        UUID dealId = UUID.randomUUID();
        Deal deal1 = new Deal();
        deal1.setDealId(dealId);
        deal1.setFromCurrency("USD");
        deal1.setToCurrency("EUR");
        deal1.setDealTimestamp(LocalDateTime.now());
        deal1.setDealAmount(BigDecimal.valueOf(1000));
        repository.save(deal1);

        Deal deal2 = new Deal();
        deal2.setDealId(dealId);
        deal2.setFromCurrency("USD");
        deal2.setToCurrency("EUR");
        deal2.setDealTimestamp(LocalDateTime.now());
        deal2.setDealAmount(BigDecimal.valueOf(1000));

        Assertions.assertThrows(DuplicateDealException.class, () -> {
            service.saveDeal(deal2);
        });
    }
}
*/