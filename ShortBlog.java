import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ShortBlog {
    private List<Innlegg> innleggListe = new ArrayList<>();

    public void leggTilInnlegg(Innlegg innlegg) {
        innleggListe.add(innlegg);
    }

    @Override
    public String toString() {
        StringBuilder html = new StringBuilder();

        html.append("<html>\n<body>\n");

        for (Innlegg innlegg : innleggListe) {
            html.append("  ").append(innlegg.toString()).append("\n");
        }

        html.append("</body>\n</html>");

        return html.toString();
    }
}