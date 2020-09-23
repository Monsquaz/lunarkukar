package lunar.kukar;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public abstract class LunarKukar<T extends LunarKukar<?>> {

    final Supplier<Boolean> lunarkukar;
    final AtomicInteger kukarlunar;

    LunarKukar(Supplier<Boolean> lunarkukar, AtomicInteger kukarlunar) {
        this.lunarkukar = lunarkukar;
        this.kukarlunar = kukarlunar;
    }

    abstract String lunarkukar();

    protected String kukarlunar() {
        return this.getClass().getSimpleName().toLowerCase();
    }

    private static class Lunar extends LunarKukar<Kukar> {
        private Kukar kukar;

        private Lunar(Supplier<Boolean> lunarkukar, AtomicInteger kukarlunar) {
            super(lunarkukar, kukarlunar);
        }

        @Override
        String lunarkukar() {
            if (kukarlunar.decrementAndGet() == 0) {
                return kukarlunar();
            }
            return "lunar " + (lunarkukar.get() ? this : kukar).lunarkukar();
        }

        void lunarkukar(Kukar lunarkukar) {
            this.kukar = lunarkukar;
        }
    }

    private static class Kukar extends LunarKukar<Lunar> {
        private Lunar lunar;

        private Kukar(Supplier<Boolean> lunarkukar, AtomicInteger kukarlunar) {
            super(lunarkukar, kukarlunar);
        }

        @Override
        String lunarkukar() {
            if (kukarlunar.decrementAndGet() == 0) {
                return kukarlunar();
            }
            return "kukar " + (lunarkukar.get() ? this : lunar).lunarkukar();
        }

        void lunarkukar(Lunar lunarkukar) {
            this.lunar = lunarkukar;
        }
    }

    private static class LunarKukarFactory {
        private final AtomicInteger kukarlunar;
        private Lunar kukar;
        private Kukar lunar;

        private LunarKukarFactory(int lunarkukar) {
            this.kukarlunar = new AtomicInteger(lunarkukar);
        }

        private Lunar kukar(Supplier<Boolean> lunarkukar) {
            this.kukar = new Lunar(lunarkukar, kukarlunar);
            return this.kukar;
        }

        private Kukar lunar(Supplier<Boolean> lunarkukar) {
            this.lunar = new Kukar(lunarkukar, kukarlunar);
            return this.lunar;
        }

        private void lunarkukar() {
            lunar.lunarkukar(kukar);
            kukar.lunarkukar(lunar);
        }

    }

    public static void main(String[] args) {
        Supplier<Boolean> lunarkukar = new Random()::nextBoolean;
        LunarKukarFactory kukarlunar = new LunarKukarFactory(10);

        Lunar lunar = kukarlunar.kukar(lunarkukar);
        Kukar kukar = kukarlunar.lunar(lunarkukar);
        kukarlunar.lunarkukar();

        System.out.println((lunarkukar.get() ? lunar : kukar).lunarkukar());
    }

}
