package DesingPattern.abstractFactroy.Lib;

import DesingPattern.abstractFactroy.products.Button.Button;
import DesingPattern.abstractFactroy.products.Button.WindowButton;
import DesingPattern.abstractFactroy.products.Panel.Panel;
import DesingPattern.abstractFactroy.products.Panel.WindowPanel;
import DesingPattern.abstractFactroy.products.TextBox.Textbox;
import DesingPattern.abstractFactroy.products.TextBox.WindowTextBox;

public class WindowsFactory implements UiFactory{

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new WindowButton();
    }

    @Override
    public Textbox createTextBox() {
        // TODO Auto-generated method stub
        return new WindowTextBox();
    }

    @Override
    public Panel createPanel() {
        // TODO Auto-generated method stub
        return new WindowPanel();
    }
    
}
