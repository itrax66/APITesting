import com.mashape.unirest.http.exceptions.UnirestException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne extends TestBaseClasses.ReportClassConfig {

    @Test
    public void TestRegisterWallet() throws UnirestException {
    Wallet.deleteAllWallets();
    Assert.assertEquals(Wallet.registerWallet("0xbF075E84BCa90fee3DD3D87857D1Ce0B12FfA072" ,
                "Ethereum").getStatus(),200);
    String responde = Accounts.getAllAcounts().asString().getBody();
    Assert.assertTrue(responde.contains("accountId"));
    }
    @Test
    public void TestDeleteOneWallet() throws UnirestException {
        Wallet.deleteAllWallets();
        WalletProperties wallet = new WalletProperties((Wallet.registerWalletAndGetInfo("0xbF075E84BCa90fee3DD3D87857D1Ce0B12FfA072" ,
                "Ethereum").getBody()));
        Assert.assertEquals(Wallet.registerWallet("0xbF075E84BCa90fee3DD3D87857D1Ce0B12FfA072" ,
                "Ethereum").getStatus(),200);
        Wallet.deleteOneWallet(wallet.getAccountID(),wallet.getAdress());
        Assert.assertFalse(Accounts.getAllAcounts().asString().getBody().contains("accountId"));

    }
    @Test
    public void TestDeleteAllWallets() throws UnirestException {
        Wallet.deleteAllWallets();
        Assert.assertFalse(Accounts.getAllAcounts().asString().getBody().contains("accountId"));
    }



}
