import java.util.ArrayList;
import java.util.List;

public class Innlegg {
    private List<Innlegg> innleggListe = new ArrayList<>();

    public void leggTilInnlegg(Innlegg innlegg) {
        innleggListe.add(innlegg);
    }

    @Override
    public String toString() {
        StringBuilder html = new StringBuilder();

        // HTML-koden fra <html> til <body> settes inn i toString-metoden[cite: 1]
        html.append("<html>\n<body>\n");

        // HTML-koden for de enkelte innleggene genereres av toHTML()[cite: 1]
        for (Innlegg innlegg : innleggListe) {
            html.append("  ").append(innlegg.toString()).append("\n");
        }

        // HTML-koden fra </body> til </html> settes inn i toString-metoden[cite: 1]
        html.append("</body>\n</html>");

        return html.toString();
    }
}
