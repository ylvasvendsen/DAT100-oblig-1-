public abstract class IInnlegg {
    private String bruker;
    private String dato;

    public IInnlegg(String  bruker, String dato) {
        this.bruker = bruker;
        this.dato = dato;
    }

    public String getBruker() {
        return bruker;
    }

    public String getDato() {
        return dato;
    }

    public abstract String toHTML();
}
