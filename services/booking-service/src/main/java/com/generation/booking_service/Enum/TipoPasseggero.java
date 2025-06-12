package com.generation.booking_service.Enum;

public enum TipoPasseggero {

    Bambino(0,12),
    Ragazzo (13,17),
    Adulto (18,60),
    Anziano (61, 120);

    private final int minAge;
    private final int maxAge;

    TipoPasseggero(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }


}
