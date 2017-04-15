package cdql.cqe.entities;

/**
 * Created by ali on 14/02/2017.
 */
public class RangeAcceptedValue extends SetAcceptedValue {
    private double start;
    protected double end;

    public RangeAcceptedValue() {
        super();
    }

    public RangeAcceptedValue(double start, double end) {
        this.start = start;
        this.end = end;
    }

    public double getStart() {
        return start;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public double getEnd() {
        return end;
    }

    public void setEnd(double end) {
        this.end = end;
    }
}
