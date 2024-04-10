import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Animal {
    public static Animal[] deserializeAnimalArray(byte[] data) {
        Animal[] animals = null;
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            Integer numAnimals = ois.readInt();
            animals = new Animal[numAnimals];
            for (int i = 0; i < numAnimals; i++) {
                animals[i] = (Animal) ois.readObject();
            }
        } catch (EOFException e) {
            throw new IllegalArgumentException(e);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        } catch (ClassCastException e) {
            throw new IllegalArgumentException(e);
        }
        return animals;
    }
}