package DesingPattern.abstractFactroy.Lib;

import DesingPattern.abstractFactroy.products.Button.Button;
import DesingPattern.abstractFactroy.products.Panel.Panel;
import DesingPattern.abstractFactroy.products.TextBox.Textbox;

public interface UiFactory {
    Button createButton();
    Textbox createTextBox();
    Panel createPanel();
}
