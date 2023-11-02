public enum Clothes {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);
    private int euroSize;

    private Clothes(int euroSize) {
        this.euroSize = euroSize;
    }

    private String size;
    public String getDescription() {
        if (this == XXS) {
            return "Детский размер";
        } else {
        return "Взрослый размер";
    }
    }
}
