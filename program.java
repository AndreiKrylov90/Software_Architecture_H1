// Задание: На основе Диаграмы классов ModelElements, разработать классы: ModelStore, PoligonalModel (Texture, Poligon), Flash, Camera, Scene

import InMemoryModel.ModelStore;
import InMemoryModel.Observer1;
import InMemoryModel.Observer2;
import ModelElements.PoligonalModel;

public class program {

    public static void main(String[] args) {

        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();

        ModelStore modelStore = new ModelStore();
        modelStore.registerModelChanger(observer1);
        modelStore.registerModelChanger(observer2);


        modelStore.addModel(new PoligonalModel());






    }
}