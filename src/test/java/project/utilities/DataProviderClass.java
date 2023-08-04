package project.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider
    public Object[][] productInfo() {
        return new Object[][]{
                {"Kitchen Table"},
                {"Black Winter Skating"},
                {"HD Television"},
                {"Men’s Black Wrist Watch"}
        };
    }


}
