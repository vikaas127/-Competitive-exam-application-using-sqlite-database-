package com.dayanand.ashok.vikasdny;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.dayanand.ashok.vikasdny.QuizContract.*;

import java.util.ArrayList;


public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MyAwesomeQuiz.db";
    private static final int DATABASE_VERSION = 18;

    private SQLiteDatabase db;

    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER, " +
                QuestionsTable.COLUMN_DIFFICULTY + " TEXT" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {
        Question q1 = new Question(" - How many numbers are there from 300 to 650 which are completely divisible by both 5 and 7?",
                "8", "9", "10","12", 3, Question.DIFFICULTY_EASY);
        addQuestion(q1);
        Question q2 = new Question(" Raman can do a work in 5 days, Jatin can do the same work in 7 days and Sachin can do the same work in 9 days. If they do the same work together and they are paid Rs 2860, then what is the share (in Rs) of Raman?",
                "1260", "700", "900","870", 1, Question.DIFFICULTY_EASY);
        addQuestion(q2);
        Question q3 = new Question(" Rs 3200 is divided among A, B and C in the ratio of 3 : 5 : 8 respectively. What is the difference (in Rs) between the share of B and C?",
                "400", "600", "800","900", 2, Question.DIFFICULTY_EASY);
        addQuestion(q3);
        Question q4 = new Question("  If the diameter of a sphere is 14 cm, then what is the surface area (in cm2) of the sphere?",
                "616", " 308", " 462","636", 1, Question.DIFFICULTY_EASY);
        addQuestion(q4);
        Question q5 = new Question(" After two successive discounts of 20% and 35%, an article is sold for Rs 50700. What is the marked price (in Rs) of the article?",
                "94000", "92500", "98500","97500", 4, Question.DIFFICULTY_EASY);
        addQuestion(q5);
        Question q6 = new Question(" - The average of 5 members of a family is 24 years. If the youngest member is 8 years old, then what was the average age (in years) of the family at the time of the birth of the youngest member?",
                "16", "20", "24","32", 2, Question.DIFFICULTY_EASY);
        addQuestion(q6);
        Question q7 = new Question("  If the price of pen decreases by 20%, then a man can buy 10 more pens for Rs 100. What is the new price (in Rs) of each pen?",
                "5", "1", "2","4", 3, Question.DIFFICULTY_EASY);
        addQuestion(q7);
        Question q8 = new Question(" - After deducting 60% from a certain number and then deducting 15% from the remainder, 1428 is left. What was the initial number?",
                "4200", "3962", "4150","4300", 1, Question.DIFFICULTY_EASY);
        addQuestion(q8);
        Question q9 = new Question(" - A train travels 40% faster than a car. Both start from point A at the same time and reach point B, 140 km away at the same time. On the way the train takes 25 minutes for stopping at the stations. What is the speed (in km/hr) of the train?",
                " 67" , "134.4", " 145.9","160", 2, Question.DIFFICULTY_EASY);
        addQuestion(q9);
        Question q10 = new Question(" - A certain sum of money triples itself in 5 years at simple interest. In how many years it will be five times?",
                "5", "8", "10","15", 3, Question.DIFFICULTY_EASY);
        addQuestion(q10);
        Question q11 = new Question(" - If x + (1/x) = 2, then what is the value of xpower(64) + xpower(121)?",
                "0", "1", "2","-2", 1, Question.DIFFICULTY_EASY);
        addQuestion(q11);
        Question q12 = new Question("The average age of 120 members of a society is 60.7 years. By addition of 30 new members, the average age becomes 56.3 years. What is the average age (in years) of newly joined members?",
                "30.1", "33.2", "32.4","38.7", 4, Question.DIFFICULTY_EASY);
        addQuestion(q12);
        Question q13 = new Question("  If a + b + c = 27, then what is the value of (a – 7)3 + (b – 9)3 + (c – 11)3 – 3(a – 7)(b – 9)(c – 11)?",
                "0", "9", "27","81", 1, Question.DIFFICULTY_EASY);
        addQuestion(q13);
        Question q14 = new Question(" If A = 30°, B = 60° and C =135°, then what is the value of sin3A + cos3B + tan3C – 3sin A cos B tan C?",
                "1", "4", "6","0", 4, Question.DIFFICULTY_EASY);
        addQuestion(q14);
        Question q15 = new Question("  The perimeter of an isosceles triangle is 32 cm and each of the equal sides is 5/6 times of the base. What is the area (in cm2) of the triangle ?",
                "39", "48", "53","64", 2, Question.DIFFICULTY_EASY);
        addQuestion(q15);
        Question q16 = new Question("- If length of each side of a rhombus PQRS is 8 cm and ∠PQR = 120°, then what is the length (in cm) of QS?",
                "4root(5)", "12", "8","6", 3, Question.DIFFICULTY_EASY);
        addQuestion(q16);
        Question q17 = new Question("The difference between the compound interest compounding half yearly for 1 year and the simple interest for 1 year on a certain sum of money lent out at 8% per annum is Rs 64. What is the sum (in Rs)?",
                "40000", "42000", "43000","44000", 1, Question.DIFFICULTY_EASY);
        addQuestion(q17);
        Question q18 = new Question(" In triangle ABC, a line is drawn from the vertex A to a point D on BC. If BC = 9 cm and DC = 3 cm, then what is the ratio of the areas of triangle ABD and triangle ADC respectively?",
                "1:1", "2:1", "3:1","4:1", 2,Question.DIFFICULTY_EASY);
        addQuestion(q18);
        Question q19 = new Question(" Simplify the following expression (sin2A/(1+cos2A))?",
                "tanA", "cosA", "CotA","sinA", 1, Question.DIFFICULTY_EASY);
        addQuestion(q19);
        Question q20 = new Question("- Simplify the following expression (secA/(tanA+cotA))^2 ?",
                " 1 – cos^2(A)", "2sin^2(A)", "sec^2(A)"," cosec^2(A)", 1, Question.DIFFICULTY_EASY);
        addQuestion(q20);
        Question q21 = new Question(". What is the simplified value of 1 + tan A tan (A/2)?",
                " sin A/2", "cos A", "secA","sinA", 3, Question.DIFFICULTY_EASY);
        addQuestion(q21);
        Question q22 = new Question(" If (x – 2) and (x + 3) are the factors of the equation x2 + k1x + k2 = 0, then what are the values of k1 and k2?",
                " k1 = 6, k2 = – 1", "k 1 = 1, k 2 = – 6", "k 1 = 1, k2 = 6","k1 = – 6, k2 = 1", 2, Question.DIFFICULTY_EASY);
        addQuestion(q22);
        Question q23 = new Question("PQR is a right angled triangle in which ∠R = 90°. If RS ⊥ PQ, PR = 3 cm and RQ = 4 cm, then what is the value of RS (in cm)?",
                "7", "12/5", "32/5","30/5", 2, Question.DIFFICULTY_EASY);
        addQuestion(q23);
        Question q24 = new Question("n triangle PQR, A is the point of intersection of all the altitudes and B is the point of intersection of all the angle bisectors of the triangle. If ∠PBR = 105°, then what is the value of ∠PAR (in degrees)?",
                "60", "100", "105","115", 1, Question.DIFFICULTY_EASY);
        addQuestion(q24);
        Question q25 = new Question("If there are four lines in a plane, then what cannot be the number of points of intersection of these lines?\n",
                "0", "5", "4","7", 4, Question.DIFFICULTY_EASY);
        addQuestion(q25);
        Question q26 = new Question(" - How many numbers are there from 300 to 650 which are completely divisible by both 5 and 7?",
                "8", "9", "10","12", 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q26);
        Question q27 = new Question(" In triangle ABC, a line is drawn from the vertex A to a point D on BC. If BC = 9 cm and DC = 3 cm, then what is the ratio of the areas of triangle ABD and triangle ADC respectively?",
                "1:1", "2:1", "3:1","4:1", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q27);
        Question q28 = new Question("Rs 3200 is divided among A, B and C in the ratio of 3 : 5 : 8 respectively. What is the difference (in Rs) between the share of B and C?",
                "400", "600", "800","900", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q28);

        Question q29 = new Question("The average age of 120 members of a society is 60.7 years. By addition of 30 new members, the average age becomes 56.3 years. What is the average age (in years) of newly joined members?",
                "30.1", "33.2", "32.4","38.7", 4, Question.DIFFICULTY_EASY);
        addQuestion(q29);
        Question q30= new Question("After two successive discounts of 20% and 35%, an article is sold for Rs 50700. What is the marked price (in Rs) of the article?",
                "94000", "92500", "98500","97500", 4, Question.DIFFICULTY_MEDIUM);
        addQuestion(q30);
        Question q31 = new Question(" Which one is the largest among the fractions (5/113), (7/120), (13/145) and (17/160)?",
                "5/113", "7/120", "17/160","13/145", 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q31);
        Question q32 = new Question("Nirmit can do 2/3 of a job in 18 days. Kashish is twice as efficient as Nirmit. In how many days Kashish will complete the job?",
                "27/2", "40/3", "31/2","13/2", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q32);
        Question q33 = new Question("40 men took a dip in a pool 30 m long and 25 m broad. If the average water displaced by a man is 5 m3, then what will be the rise (in cm) in level of the pool?",
                "25", "26.66", "27.33","28", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q33);
        Question q34 = new Question(" An article is listed at Rs 2375. A man purchases it at two successive discounts of 50% and 25% and spends Rs 165 on repairing of article. If he sells the article at a profit of 62.5%, then what is the selling price (in Rs) of the article?",
                "1467.6", "1492.6", "1715.39","1467.6", 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q34);
        Question q35 = new Question("The length, breadth and height of a cuboid are in the ratio 19 : 11 : 13. If length is 30 cm more than height, then what is the volume (in cm3) of this cuboid?",
                "81510", "89665", "195300","339625", 4, Question.DIFFICULTY_MEDIUM);
        addQuestion(q35);
        Question q36 = new Question("- Average age of a team having 12 players is 23 years. If the age of the coach is also included, then the average age increases by 2 years. What is the age (in years) of the coach?",
                "41", "47", "49","51", 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q36);
        Question q37 = new Question("An item is sold at two successive gains of 30% and 20%. If the final selling price is Rs 31200, then what is the cost price (in Rs)?",
                "20000", "22000", "24000","22500", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q37);
        Question q38 = new Question(" ABCD is a parallelogram in which AB = 7 cm, BC = 9 cm and AC = 8 cm. What is the length (in cm) of other diagonal?\n" ,
                "14", "7", "14√2","7√2", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q38);
        Question q39 = new Question("If (x + y)2 = xy + 1 and x3 – y3 = 1, then what is the value of x – y?",
                "0", "1", "-1","2", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q39);
        Question q40 = new Question(" If (5x – y)/(5x + y) = 3/7, then what is the value of (4x^2 + y^2 – 4xy)/(9x^2 + 16y^2 + 24xy)?",
                "0", "3/7", "9/49","1/6", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q40);
        Question q41 = new Question("The simple interest on a sum of money for 10 years is Rs 3130. If the principal becomes 5 times after 5 years, then what will be the total interest (in Rs) obtained after 10 years?",
                "6260", "9390", "5672","14789", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q41);
        Question q42 = new Question(" Aman and Kapil starts from Delhi and Gwalior respectively towards each other at same time. They meet at Mathura and then take 196 minutes and 225 minutes respectively to reach Gwalior and Delhi. If speed of Aman is 30 km/hr, then what is the speed (in km/hr) of Kapil?",
                "28", "30", "225/7","32", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q42);
        Question q43 = new Question(" The number of trees in a town is 17640. If the numbers of trees increases annually at the rate of 5%, then how many trees were there 2 years ago?",
                "16000", "15000", "14000","19450", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q43);
        Question q44 = new Question(" If A = 30°, B = 60° andC = 135°, then what is the value of sin3A + cos3B + tan3C – 3sin A cos B tan C? ",
                "1", "0", "9","4", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q44);
        Question q45 = new Question("How many diagonals are there in octagon?",
                "12", "18", "24","20", 4, Question.DIFFICULTY_MEDIUM);
        addQuestion(q45);
        Question q46 = new Question(" If the diameter of a sphere is 14 cm, then what is the surface area (in cm2) of the sphere?",
                "616", " 308", " 462","636", 1, Question.DIFFICULTY_MEDIUM);

        addQuestion(q46);
        Question q47 = new Question("If there are four lines in a plane, then what cannot be the number of points of intersection of these lines?\n",
                "0", "5", "4","7", 4, Question.DIFFICULTY_MEDIUM);

        addQuestion(q47);
        Question q48 = new Question("A square is inscribed in a quarter circle in such a way that two of its adjacent vertices on the radius are equidistant from the centre and other two vertices lie on the circumference. If the side of square is √(5/2) cm, then what is the radius (in cm) of the circle?",
                "2", "2.5", "10","15", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q48);
        Question q49 = new Question(" If sec2 θ + tan2 θ = 5/3, then what is the value of tan 2θ?",
                "2√3", "√3", "1/√3","Cannot be determined", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q49);
        Question q50 = new Question(" A tower is broken at a point P above the ground. The top of the tower makes an angle 60° with the ground at Q. From another point R on the opposite side of Q angle of elevation of point P is 30°. If QR = 180 m, then what is the total height (in metres) of the tower?",
                "45(√3 + 2)", "90", "45","45(√3 + 1)", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q50);
        Question q51 = new Question("  If sin θ + sin 5θ = sin 3θ and 0 < θ < (π/2), then what is the value of θ (in degrees)?",
                "30", "45", "60","75", 1, Question.DIFFICULTY_HARD);
        addQuestion(q51);
        Question q52 = new Question(" Raman can do a work in 5 days, Jatin can do the same work in 7 days and Sachin can do the same work in 9 days. If they do the same work together and they are paid Rs 2860, then what is the share (in Rs) of Raman?",
                "1260", "700", "900","870", 1, Question.DIFFICULTY_HARD);
        addQuestion(q52);
        Question q53 = new Question("Rs 3200 is divided among A, B and C in the ratio of 3 : 5 : 8 respectively. What is the difference (in Rs) between the share of B and C?",
                "400", "600", "800","900", 2, Question.DIFFICULTY_HARD);
        addQuestion(q53);
        Question q54 = new Question(" If the diameter of a sphere is 14 cm, then what is the surface area (in cm2) of the sphere?",
                "616", " 308", " 462","636", 1, Question.DIFFICULTY_HARD);
        addQuestion(q54);
        Question q55 = new Question(" If A = 30°, B = 60° and C = 135°, then what is the value of sin^3A + cos^3B + tan^3C – 3sin A cos B tan C?",
                "0", "1", "4","9", 1, Question.DIFFICULTY_HARD);
        addQuestion(q55);
        Question q56 = new Question("What is the least value of tan2 θ + cot2 θ + sin2 θ + cos2 θ + sec2 θ + cosec2 θ?",
                "1", "2", "5","7", 4, Question.DIFFICULTY_HARD);
        addQuestion(q56);
        Question q57 = new Question("- If 5 sec θ – 3 tan θ = 5, then what is the value of 5 tan θ – 3 sec θ?",
                "1", "2", "3","4", 3, Question.DIFFICULTY_HARD);
        addQuestion(q57);
        Question q58 = new Question("Two chords of length 20 cm and 24 cm are drawn perpendicular to each other in a circle of radius is 15 cm. What is the distance between the Points of intersection of these chords (in cm) from the center of the circle?\n",
                "Root(114)", "Root(182)", "Root(206)","Root(218)", 3, Question.DIFFICULTY_HARD);
        addQuestion(q58);
        Question q59 = new Question("- If x^1/4 + x^-1/4 = 2, then what is the value of x81 + (1/x81)?\n" ,
                "-2", "0", "1","2", 4, Question.DIFFICULTY_HARD);
        addQuestion(q59);
        Question q60 = new Question("If x^2 + (1/x^2) = 1, then what is the value of x^48 + x^42 + x^36 + x^30 + x^24 + x^18 + x^12 + x^6 + 1?",
                "9", "0", "1","-9", 3, Question.DIFFICULTY_HARD);
        addQuestion(q60);
        Question q61 = new Question(" If a(a + b + c) = 45, b(a + b + c) = 75 and c(a + b + c) = 105, then what is the value of (a^2 + b^2 + c^2)?",
                "75", "83", "217","41", 2, Question.DIFFICULTY_HARD);
        addQuestion(q61);
        Question q62 = new Question("If (x^2/yz) + (y^2/zx) + (z^2/xy) = 3, then what is the value of (x + y + z)^3?",
                "0", "1", "2","3", 1, Question.DIFFICULTY_HARD);
        addQuestion(q62);
        Question q63 = new Question("If there are four lines in a plane, then what cannot be the number of points of intersection of these lines?\n",
                "0", "5", "4","7", 4, Question.DIFFICULTY_HARD);

        addQuestion(q63);

        Question q64 = new Question(" If the diameter of a sphere is 14 cm, then what is the surface area (in cm2) of the sphere?",
                "616", " 308", " 462","636", 1, Question.DIFFICULTY_HARD);
        addQuestion(q64);
        Question q65 = new Question("The average age of 120 members of a society is 60.7 years. By addition of 30 new members, the average age becomes 56.3 years. What is the average age (in years) of newly joined members?",
                "30.1", "33.2", "32.4","38.7", 4, Question.DIFFICULTY_HARD);
        addQuestion(q65);
        Question q66 = new Question("The difference of compound interest and simple interest for 3 years and for 2 years are in ratio 23 : 7 respectively. What is rate of interest per annum (in %)?",
                "300/7", "400/7", "500/7","200/7", 4, Question.DIFFICULTY_HARD);
        addQuestion(q66);
        Question q67 = new Question(" A man starts running from point P at 11:00 a.m. with a speed of 10 km/hr. He runs for 2 hours and then takes a 1 hour rest. He continues this till he is caught by another man who starts at 2:00 p.m. from point P and runs non-stop at a speed of 15 km/hr towards the first man. At what time (in p.m.) will the first man be caught?",
                "4:40", "3:20", "4:15","4:25", 1, Question.DIFFICULTY_HARD);
        addQuestion(q67);
        Question q68 = new Question("- A person scores 45% of the total marks in the exam and still fails by 40 marks. The passing percentage of the exam is 55%. What is the maximum marks of the exam?",
                "300", "400", "350","450", 2, Question.DIFFICULTY_HARD);
        addQuestion(q68);
        Question q69 = new Question("The cost price of 60 articles is same as the selling price of x articles. If there is a profit of 20%, then what is the value of x?",
                "15", "30", "50","80", 3, Question.DIFFICULTY_HARD);
        addQuestion(q69);
        Question q70 = new Question(" 5 years ago the average age of a family which includes father, mother and a son was 35 years. 3 years ago the average age of father and mother was 46 years. What is the present age (in years) of the son?",
                "20", "24", "26","22", 4, Question.DIFFICULTY_HARD);
        addQuestion(q70);
        Question q71 = new Question("If A/3 = B/2 = C/5, then what is the value of ratio (C + A)^2 : (A + B)^2 : (B + C)^2?",
                "9:4:25", " 25 : 4 : 9", " 64 : 25 : 49","49 : 25 : 64", 3, Question.DIFFICULTY_HARD);
        addQuestion(q71);
        Question q72 = new Question(" A shopkeeper sells a table at a discount of 20% and earns a profit of 60%. If he sells the same table at 40% discount, then what will be his new profit percent?",
                "20", "30", "35","40", 1, Question.DIFFICULTY_HARD);
        addQuestion(q72);
        Question q73 = new Question("One of the diagonal of a rhombus is 70% of the other diagonal. What is the ratio of area of rhombus to the square of the length of the larger diagonal?",
                "3:10", "3:20", "7:10","7:20", 4, Question.DIFFICULTY_HARD);
        addQuestion(q73);
        Question q74 = new Question(" A is 1.5 times efficient than B therefore takes 8 days less than B to complete a work. If A and B work on alternate days and A works on first day, then in how many days the work will  be completed?",
                "17", "19", "21.5","19.5", 2, Question.DIFFICULTY_HARD);
        addQuestion(q74);
        Question q75 = new Question(" What least value which should be added to 1812 to make it divisible by 7, 11 and 14?",
                "12", "36", "72","132", 2, Question.DIFFICULTY_HARD);
        addQuestion(q75);

    }


    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_OPTION4, question.getOption4());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        cv.put(QuestionsTable.COLUMN_DIFFICULTY, question.getDifficulty());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }

    public ArrayList<Question> getAllQuestions() {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }

    public ArrayList<Question> getQuestions(String difficulty) {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();

        String[] selectionArgs = new String[]{difficulty};
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME +
                " WHERE " + QuestionsTable.COLUMN_DIFFICULTY + " = ?", selectionArgs);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}