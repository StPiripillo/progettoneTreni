package com.generation.booking_service.Enum;

public enum StatoBiglietto {
    // Enum per rappresentare lo stato di un biglietto
    Prenotato, // Biglietto prenotato ma non ancora pagato
    Pagato, // Biglietto pagato
    Annullato, // Biglietto annullato
    Scaduto; // Biglietto scaduto

    // Metodo per ottenere il nome dello stato in formato leggibile
    public String getStato() {
        return this.name().toLowerCase();
    }
}
