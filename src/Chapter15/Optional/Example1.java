package Chapter15.Optional;

import Chapter15.Cat;

import java.util.Optional;

public class Example1 {
    public static void main(String[] args) {
        Optional<Cat> foundCat = getCat();

        if (foundCat.isPresent()) {
            Cat cat = foundCat.get();
            System.out.println(cat);
        }

    }

    private static Optional<Cat> getCat(){
        return Optional.of(new Cat("Tom",10));
    }
}
