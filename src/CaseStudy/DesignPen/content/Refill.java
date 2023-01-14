package CaseStudy.DesignPen.content;

public class Refill {
    private Ink ink;
    private Nib nib;
    private RefillType refillType;
    
    public Ink getInk() {
        return ink;
    }
    public void setInk(Ink ink) {
        this.ink = ink;
    }
    public Nib getNib() {
        return nib;
    }
    public void setNib(Nib nib) {
        this.nib = nib;
    }
    public RefillType getRefillType() {
        return refillType;
    }
    public void setRefillType(RefillType refillType) {
        this.refillType = refillType;
    }

    
}
