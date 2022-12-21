package DesingPattern.abstractFactroy.Lib;

import DesingPattern.abstractFactroy.factory.UiFactoryfactory;

public class Lib {
    public void setAspectRatio(int i) {
        /////
    }
    public UiFactory getUiFactory(String platform){
        return UiFactoryfactory.getUiFactory(platform);
    }
}
