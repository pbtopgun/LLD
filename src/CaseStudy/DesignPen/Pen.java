package CaseStudy.DesignPen;

import CaseStudy.DesignPen.content.Cap;
import CaseStudy.DesignPen.strategy.WriteStrategy;

public abstract class Pen {
    String name;
    String bodyColor; // ENUM yes this can be enum body color
    int length;
    int price;
    Cap cap;
    WriteStrategy objWriteStrategy;

    abstract void write();
}
