package pl.muyncio;

import java.util.ArrayList;

public class Generator {
    String[] names = {"Ada", "Adela", "Adelajda", "Alina", "Alicja", "Agnieszka", "Amanda", "Andżelika", "Aneta", "Apolonia",
                        "Barbara", "Bianka", "Celestyna", "Czesława", "Dagna", "Daria", "Dominika", "Eliza", "Ewa", "Fiona",
                        "Faustyna", "Franciszka", "Gabriela", "Grzymisława", "Halina", "Helga", "Ilona", "Izabela", "Jagoda", "Jolanta",
                        "Kaja", "Karolina", "Kinga", "Magdalena", "Aleksandra", "Marzena", "Olga", "Pamela", "Rita", "Róża",
                        "Sara", "Samanta", "Tamara", "Teresa", "Ula", "Wioleta", "Violetta", "Władysława", "Zdzisława", "Żaneta",
                        "Adam", "Alan", "Andrzej", "Baltazar", "Borys", "Bruno", "Cezar", "Cyprian", "Czesław", "Dariusz",
                        "Denis", "Dominik", "Donald", "Dymitr", "Edward", "Erwin", "Emil", "Eryk", "Fabian", "Filip",
                        "Gabriel", "Gracjan", "Gustaw", "Hasan", "Herbert", "Hugo", "Igor", "Izydor", "Jacek", "Jan",
                        "Janusz", "Jonasz", "Kacper", "Lambert", "Leon", "Łukasz", "Maciej", "Marcin", "Mariusz", "Nikodem",
                        "Oleg", "Pankracy", "Rafał", "Sławek", "Szymon", "Tadeusz", "Tomasz", "Wacław", "Grzegorz", "Zenon"};

    String[] surnames= {"Abraczyk", "Adamowicz", "Araszkiewicz", "Bachleda", "Baran", "Białas", "Bielecki", "Bizoń", "Bogurka", "Burtymowicz",
                        "Chlebek", "Chodura", "Cholewiński", "Cichoń", "Czech", "Chlebek", "Ciechanowski", "Dąbek", "Dębicki", "Domagała",
                        "Waligóra", "Dziadosz", "Dzikowski", "Ekielski", "Filipczak", "Fiut", "Fogiel", "Frankowski", "Grabowski", "Gawron",
                        "Gawryś", "Godlewski", "Grochowiak", "Hrycyk", "Iwański", "Jabłkowski", "Jachimowicz", "Jank", "Janowski", "Kaczmarek",
                        "Karpiński", "Kasprowicz", "Klimek", "Kokoszek", "Kołłątaj", "Komarnicki", "Korczowski", "Korwin", "Kot", "Kozłowski",
                        "Kozubek", "Krawczyk", "Kowalski", "Kulas", "Kucharski", "Lewandowski", "Lewek", "Lipiński", "Maciejewski", "Młynarski",
                        "Maciaszek", "Malinowski", "Mazur", "Mazurek", "Mąkosza", "Michnik", "Młynarczyk", "Moskal", "Muszyński", "Myśliwiec",
                        "Napierski", "Niemiec", "Niewiarowski", "Oborski", "Olszewski", "Oleszek", "Pajączkowski", "Pankau", "Pankiewicz", "Pacewicz",
                        "Pawlak", "Pelc", "Pałka", "Piekarski", "Pietrzykowski", "Pilarski", "Piskorski", "Pluta", "Raczyński", "Raszewski",
                        "Rataj", "Rogalski", "Rogucki", "Salicki", "Smolar", "Snopkiewicz", "Tarczyński", "Tyszka", "Wielkopolski", "Zawada"};

    String nameAndSurname;
    ArrayList <String> nameAndSurnameArr = new ArrayList();


    public ArrayList<String> generatorNamesWithSurnames(){
        for (int i = 0; i <=50000; i++){
            int x = ((int)(Math.random()*100));
            int y = ((int)(Math.random()*100));

            nameAndSurname = names[x] + " " + surnames[y];

            nameAndSurnameArr.add(nameAndSurname);
        }

        return nameAndSurnameArr;
    }
}
