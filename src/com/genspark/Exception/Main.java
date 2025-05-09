package com.genspark.Exception;

import com.genspark.Exception.exception.AppSizeTooLargeException;
import com.genspark.Exception.exception.DeveloperBannedException;
import com.genspark.Exception.exception.InvalidCategoryException;
import com.genspark.Exception.exception.PricingException;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        AppValidator appValidator = new AppValidator();

        Set<App> apps = Set.of(
                new App("SuperGame", "Dev", 450, "Games", 49.99),
                new App("HugeApp", "GoodDev", 550, "Utility", 25),
                new App("FinanceMaster", "SpammerInc", 50, "Finance", 9.99),
                new App("SecretTool", "HackerDev", 300, "Hacking", 0),
                new App("EnterpriseSuite", "TrustedCorp", 480, "Enterprise", 150),
                new App("FreeTool", "GoodDev", 400, "Utility", -5)
        );

        for(App app : apps) {
            try {
                appValidator.validateApps(app);
                System.out.println("App " + app.getAppName() + " by " + app.getDeveloperName() + " is approved for publishing.");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Validation completed for " + app.getAppName());
                System.out.println("----------------");
            }
        }
    }
}
