package uz.gita.a4pics1word.domain.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.inject.Singleton;

import uz.gita.a4pics1word.R;
import uz.gita.a4pics1word.data.model.QuestionData;

@Singleton
@Deprecated
public class Repository {
    private static Repository repository;
   /* private final LocalStorage storage;*/
    private List<QuestionData> questions;


    private Repository() {
       /* storage = LocalStorage.getStorage();*/
        questions = new ArrayList<QuestionData>();
        initQuestions();
    }

    public static Repository getRepository() {
        if (repository == null) {
            repository = new Repository();
        }
        return repository;
    }


 /*   public void saveCurrentQuestionPos(int pos) {
        storage.saveQuestionPos(pos);
    }

    public int getCurrentQuestionPos() {
        return storage.getQuestionPos();
    }


    public QuestionData getCurrentQuestion() {
        return questions.get(getCurrentQuestionPos());
    }*/

    public QuestionData getQuestionByPosition(int position) {
        return questions.get(position);
    }

    private void initQuestions() {
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_477_1,
                        R.drawable.img_477_2,
                        R.drawable.img_477_3,
                        R.drawable.img_477_4),
                "MOUSE",
                generateVariant("MOUSE")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_479_1,
                        R.drawable.img_479_2,
                        R.drawable.img_479_3,
                        R.drawable.img_479_4),
                "ICE",
                generateVariant("ICE")
        ));

        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_435_1,
                        R.drawable.img_435_2,
                        R.drawable.img_435_3,
                        R.drawable.img_435_4),
                "BOX",
                generateVariant("BOX")
        ));

        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_1102_1,
                        R.drawable.img_1102_2,
                        R.drawable.img_1102_3,
                        R.drawable.img_1102_4),
                "RING",
                generateVariant("RING")
        ));

        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_143_1,
                        R.drawable.img_143_2,
                        R.drawable.img_143_3,
                        R.drawable.img_143_4),
                "WAVE",
                generateVariant("WAVE")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_2488_1,
                        R.drawable.img_2488_2,
                        R.drawable.img_2488_3,
                        R.drawable.img_2488_4),
                "PET",
                generateVariant("PET")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_2417_1,
                        R.drawable.img_2417_2,
                        R.drawable.img_2417_3,
                        R.drawable.img_2417_4),
                "HORSE",
                generateVariant("HORSE")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_2520_1,
                        R.drawable.img_2520_2,
                        R.drawable.img_2520_3,
                        R.drawable.img_2520_4),
                "ROOT",
                generateVariant("ROOT")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_436_1,
                        R.drawable.img_436_2,
                        R.drawable.img_436_3,
                        R.drawable.img_436_4),
                "BARK",
                generateVariant("BARK")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_2493_1,
                        R.drawable.img_2493_2,
                        R.drawable.img_2493_3,
                        R.drawable.img_2493_4),
                "FIRM",
                generateVariant("FIRM")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_19_1,
                        R.drawable.img_19_2,
                        R.drawable.img_19_3,
                        R.drawable.img_19_4),
                "SWEET",
                generateVariant("SWEET")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_1454_1,
                        R.drawable.img_1454_2,
                        R.drawable.img_1454_3,
                        R.drawable.img_1454_4),
                "FRUIT",
                generateVariant("FRUIT")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_439_1,
                        R.drawable.img_439_2,
                        R.drawable.img_439_3,
                        R.drawable.img_439_4),
                "BED",
                generateVariant("BED")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_138_1,
                        R.drawable.img_138_2,
                        R.drawable.img_138_3,
                        R.drawable.img_138_4),
                "SIGN",
                generateVariant("SIGN")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_2285_1,
                        R.drawable.img_2285_2,
                        R.drawable.img_2285_3,
                        R.drawable.img_2285_4),
                "ASSEMBLY",
                generateVariant("ASSEMBLY")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_2450_1,
                        R.drawable.img_2450_2,
                        R.drawable.img_2450_3,
                        R.drawable.img_2450_4),
                "BABY",
                generateVariant("BABY")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_1730_1,
                        R.drawable.img_1730_2,
                        R.drawable.img_1730_3,
                        R.drawable.img_1730_4),
                "COLOR",
                generateVariant("COLOR")
        ));
        //18
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_507_1,
                        R.drawable.img_507_2,
                        R.drawable.img_507_3,
                        R.drawable.img_507_4),
                "SPRAY",
                generateVariant("SPRAY")
        ));
        //19
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_403_1,
                        R.drawable.img_403_2,
                        R.drawable.img_403_3,
                        R.drawable.img_403_4),
                "ROLL",
                generateVariant("ROLL")
        ));

        //20
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_400_1,
                        R.drawable.img_400_2,
                        R.drawable.img_400_3,
                        R.drawable.img_400_4),
                "MUSIC",
                generateVariant("MUSIC")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_2098_1,
                        R.drawable.img_2098_2,
                        R.drawable.img_2098_3,
                        R.drawable.img_2098_4),
                "BIRD",
                generateVariant("BIRD")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_12_1,
                        R.drawable.img_12_2,
                        R.drawable.img_12_3,
                        R.drawable.img_12_4),
                "COLD",
                generateVariant("COLD")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_92_1,
                        R.drawable.img_92_2,
                        R.drawable.img_92_3,
                        R.drawable.img_92_4),
                "LONG",
                generateVariant("LONG")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_450_1,
                        R.drawable.img_450_2,
                        R.drawable.img_450_3,
                        R.drawable.img_450_4),
                "SNOW",
                generateVariant("SNOW")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_3569_1,
                        R.drawable.img_3569_2,
                        R.drawable.img_3569_3,
                        R.drawable.img_3569_4),
                "CART",
                generateVariant("CART")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_1520_1,
                        R.drawable.img_1520_2,
                        R.drawable.img_1520_3,
                        R.drawable.img_1520_4),
                "COTTON",
                generateVariant("COTTON")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_2294_1,
                        R.drawable.img_2294_2,
                        R.drawable.img_2294_3,
                        R.drawable.img_2294_4),
                "SPECTRUM",
                generateVariant("SPECTRUM")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_2104_1,
                        R.drawable.img_2104_2,
                        R.drawable.img_2104_3,
                        R.drawable.img_2104_4),
                "PEACE",
                generateVariant("PEACE")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_437_1,
                        R.drawable.img_437_2,
                        R.drawable.img_437_3,
                        R.drawable.img_437_4),
                "BACK",
                generateVariant("BACK")
        ));
        questions.add(new QuestionData(
                Arrays.asList(
                        R.drawable.img_2474_1,
                        R.drawable.img_2474_2,
                        R.drawable.img_2474_3,
                        R.drawable.img_2474_4),
                "FAMILY",
                generateVariant("FAMILY")
        ));
    }

    private String generateVariant(String answer) {
        List<Character> variant = new ArrayList<>(14);
        List<Character> letters = Arrays.asList(
                'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                'V', 'W', 'X', 'Y', 'Z'
        );
        for (int i = 0; i < answer.length(); i++) {
            variant.add(answer.charAt(i));
        }
        Random random = new Random();
        for (int i = answer.length(); i < 14; i++) {
            variant.add(letters.get(random.nextInt(26)));
        }
        Collections.shuffle(variant);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < variant.size(); i++) {
            sb.append(variant.get(i));
        }
        return sb.toString();
    }

    public int getLevelCount() {
        return questions.size();
    }
}
