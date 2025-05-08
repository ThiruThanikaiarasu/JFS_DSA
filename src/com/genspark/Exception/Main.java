package com.genspark.Exception;

import com.genspark.Exception.exception.AppSizeTooLargeException;
import com.genspark.Exception.exception.DeveloperBannedException;
import com.genspark.Exception.exception.InvalidCategoryException;
import com.genspark.Exception.exception.PricingException;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AppValidator appValidator = new AppValidator();

        App superGame = new App("SuperGame", "Dev", 450, "Games", 49.99);
        App hugeApp = new App("HugeApp", "GoodDev", 550, "Utility", 25);
        App financeMaster = new App("FinanceMaster", "SpammerInc", 50, "Finance", 9.99);
        App secretTool = new App("SecretTool", "HackerDev", 300, "Hacking", 0);
        App enterpriseSuite = new App("EnterpriseSuite", "TrustedCorp", 480, "Enterprise", 150);
        App freeTool = new App("FreeTool", "GoodDev", 400, "Utility", -5);

        List<App> apps = Arrays.asList(superGame, hugeApp, financeMaster, secretTool, enterpriseSuite, freeTool);

        for(App app : apps) {
            try {
                appValidator.validateApps(app);
                System.out.println("App " + app.getAppName() + " by " + app.getDeveloperName() + " is approved for publishing.");
            }
            catch (AppSizeTooLargeException | InvalidCategoryException | PricingException | DeveloperBannedException e) {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Validation completed for " + app.getAppName());
                System.out.println("----------------");
            }
        }
    }
}
