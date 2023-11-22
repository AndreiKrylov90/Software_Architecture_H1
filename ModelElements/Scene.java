package ModelElements;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Сцена
 * DONE: Сделаны 3 поля для класса, установен конструктор и геттеры, добавлены 2 метода: один добавляет на сцену источник света, 
 * второй позволяет увеличить сцену.
 */
public class Scene {

    private static int counter = 1000;
    private int id;

    private Collection<PoligonalModel> models = new ArrayList<>();

    private Collection<Flash> flashes = new ArrayList<>();

    public int getId() {
        return id;
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public Scene(Collection<PoligonalModel> models, Collection<Flash> flashes) {
        this.models = models;
        this.flashes = flashes;
        id = ++counter;
    }

    public void addFlash(Flash flash) {

        flashes.add(flash);

    }

    public void addPoligon(PoligonalModel poligonModel) {

        models.add(poligonModel);

    }

}
