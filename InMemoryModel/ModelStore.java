package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Хранилище 3D-элементов
 * DONE: Добавлены поля: models, scenes, flashes, cameras. Добавлен конструктор
 * и геттеры. Добавлен метод, возвращающий определенную сцену по её индексу.
 */
public class ModelStore implements ModelChanger {

    private Collection<ModelChangedObserver> observers = new ArrayList<>();

    private Collection<PoligonalModel> models = new ArrayList<>();
    private Collection<Scene> scenes = new ArrayList<>();
    private Collection<Flash> flashes = new ArrayList<>();
    private Collection<Camera> cameras = new ArrayList<>();

    public ModelStore(Collection<PoligonalModel> models, Collection<Scene> scenes, Collection<Flash> flashes,
            Collection<Camera> cameras) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public ModelStore() {
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public Collection<Scene> getScenes() {
        return scenes;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    @Override
    public void registerModelChanger(ModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void removeModelChanger(ModelChangedObserver o) {
        observers.remove(o);
    }

    /**
     * Нотификация изменений на уровне хранилища
     */
    private void notifyChange() {
        for (ModelChangedObserver observer : observers) {
            observer.applyUpdateModel();
        }
    }

    public void addModel(PoligonalModel poligonalModel) {
        notifyChange();
    }

    public Scene getScene(int index) {
        return ((ArrayList<Scene>) scenes).get(index);

    }

}
