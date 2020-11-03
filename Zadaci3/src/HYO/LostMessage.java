package HYO;

class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

class EvenMoreTrivialException extends Exception {
    public String toString() {
        return "An even more trivial exception";
    }
}

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
            throw new HoHumException();
    }

    void clear() throws EvenMoreTrivialException {
        throw new EvenMoreTrivialException();
    }

    public static void main(String[] args) {

        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                try {
                    lm.dispose();
                } finally{
                     try{
                        lm.clear();
                    } finally{
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}