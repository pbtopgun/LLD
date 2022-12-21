package DesingPattern.abstractFactroy.factory;

import DesingPattern.abstractFactroy.Lib.IOSFactory;
import DesingPattern.abstractFactroy.Lib.UiFactory;
import DesingPattern.abstractFactroy.Lib.WindowsFactory;

public class UiFactoryfactory {
    
     public static UiFactory getUiFactory(String platform) {
        if("Window".equalsIgnoreCase(platform)) {
            return new WindowsFactory();
        } else if("IOS".equalsIgnoreCase(platform)) {
            return new IOSFactory();
        }
        /**   ANY NEW type say android will just need to be added to this class ONLY.
        else if("Android".equalsIgnoreCase(platform)) {
            return new AndroidFactory();
        }
        **/
        return new IOSFactory();  //1. Null, 2. you can return some default, 3. you can raise exception
    }
}
