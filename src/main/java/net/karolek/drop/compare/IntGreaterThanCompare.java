package net.karolek.drop.compare;

public class IntGreaterThanCompare extends AbstractIntCompare {

    public IntGreaterThanCompare(int value) {
        super(value);
    }

    @Override
    public boolean isInRange(Integer i) {
        return i > value;
    }

    @Override
    public CompareType getCompareType() {
        return CompareType.GREATER_THAN;
    }

    @Override
    public String getParse() {
        return ">" + value;
    }
}
