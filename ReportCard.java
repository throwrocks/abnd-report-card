package rocks.athrow.report_card_abnd;

/**
 * ReportCard
 * A class to manage student report cards
 * Created by Jose on 7/11/16.
 */
class ReportCard {
    private String schoolYear;
    private String semesterdId;
    private int studentId;
    private int mathGrade;
    private int englishGrade;
    private int spanishGrade;
    private int historyGrade;
    private int physicsGrade;
    private int biologyGrade;
    private int gymGrade;
    private int artGrade;

    /**
     * ReportCard Constructor
     * Use this constructor to create a Report Card with all the grades
     *
     * @param studentId    the student id to whom the report card belongs
     * @param mathGrade    the grade for the match course
     * @param englishGrade the grade for the english course
     * @param spanishGrade the grade for the spanish course
     * @param historyGrade the grade for the history course
     * @param physicsGrade the grade for the physics course
     * @param biologyGrade the grade for the biology course
     * @param gymGrade     the grade for the gym course
     * @param artGrade     the grade for the art course
     */
    public ReportCard(int studentId, int mathGrade, int englishGrade,
                      int spanishGrade, int historyGrade, int physicsGrade,
                      int biologyGrade, int gymGrade, int artGrade) {
        this.schoolYear = "2016-17";
        this.semesterdId = "Fall";
        this.studentId = studentId;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.spanishGrade = spanishGrade;
        this.historyGrade = historyGrade;
        this.physicsGrade = physicsGrade;
        this.biologyGrade = biologyGrade;
        this.gymGrade = gymGrade;
        this.artGrade = artGrade;
    }

    /**
     * ReportCard Constructor
     * Use this constructor to create a Report Card and set the grades later
     *
     * @param studentId the student's id to whom the report card belongs
     */
    public ReportCard(int studentId) {
        this.schoolYear = "2016-17";
        this.semesterdId = "Fall";
        this.studentId = studentId;
    }

    /**
     * toString
     * A public method to get the report card's information
     *
     * @return a JSON string containing all the report card data
     */
    @Override
    public String toString() {
        return "{\"ReportCard\":{" +
                "\"schoolYear\":" + "\"" + schoolYear + "\"," +
                "\"semesterdId\":" + "\"" + semesterdId + "\"," +
                "\"studentId\":" + studentId + "," +
                "\"mathGrade\":" + mathGrade + "," +
                "\"englishGrade\":" + englishGrade + "," +
                "\"spanishGrade\":" + spanishGrade + "," +
                "\"historyGrade\":" + historyGrade + "," +
                "\"physicsGrade\":" + physicsGrade + "," +
                "\"biologyGrade\":" + biologyGrade + "," +
                "\"gymGrade\":" + gymGrade + "," +
                "\"artGrade\":" + artGrade + "," +
                "\"mathGradeLetter\":" + "\"" + getGradeLetter("math") + "\"," +
                "\"englishGradeLetter\":" + "\"" + getGradeLetter("english") + "\"," +
                "\"spanishGradeLetter\":" + "\"" + getGradeLetter("spanish") + "\"," +
                "\"historyGradeLetter\":" + "\"" + getGradeLetter("history") + "\"," +
                "\"physicsGradeLetter\":" + "\"" + getGradeLetter("physics") + "\"," +
                "\"biologyGradeLetter\":" + "\"" + getGradeLetter("biology") + "\"," +
                "\"gymGradeLetter\":" + "\"" + getGradeLetter("gym") + "\"," +
                "\"artGradeLetter\":" + "\"" + getGradeLetter("art") + "\"" +
                "}}";
    }

    /**
     * getGradeLetter
     * Public method to get a grade in letter format f
     * Dependencies: getReadableGrade()
     *
     * @param className the name of the class to get the grade for
     * @return a readable grade
     */
    private String getGradeLetter(String className) {
        String result;
        switch (className) {
            case "math":
                result = convertGrade(getMathGrade());
                break;
            case "english":
                result = convertGrade(getEnglishGrade());
                break;
            case "spanish":
                result = convertGrade(getSpanishGrade());
                break;
            case "history":
                result = convertGrade(getHistoryGrade());
                break;
            case "physics":
                result = convertGrade(getPhysicsGrade());
                break;
            case "biology":
                result = convertGrade(getBiologyGrade());
                break;
            case "gym":
                result = convertGrade(getGymGrade());
                break;
            case "art":
                result = convertGrade(getArtGrade());
                break;
            default:
                result = "invalid class name";
                break;
        }
        return result;
    }

    /**
     * convertGrade
     * Converts a grade number in the range of 0 to 100 into a letter
     * based on a standard grading system
     *
     * @param grade the grade in number format
     * @return the grade in letter format
     */
    private String convertGrade(int grade) {
        String result;
        if (grade == 0 || grade < 60) {
            result = "F";
        } else if (grade > 59 && grade < 70) {
            result = "D";
        } else if (grade > 69 && grade < 80) {
            result = "C";
        } else if (grade > 79 && grade < 90) {
            result = "B";
        } else if (grade > 89 || grade == 100) {
            result = "A";
        } else {
            result = "invalid grade";
        }
        return result;
    }

    /*
    Getters - Private methods to get the grade information
    and return it via the API
     */
    private int getMathGrade() {
        return mathGrade;
    }

    private int getEnglishGrade() {
        return englishGrade;
    }

    private int getSpanishGrade() {
        return spanishGrade;
    }

    private int getHistoryGrade() {
        return historyGrade;
    }

    private int getPhysicsGrade() {
        return physicsGrade;
    }

    private int getBiologyGrade() {
        return biologyGrade;
    }

    private int getGymGrade() {
        return gymGrade;
    }

    private int getArtGrade() {
        return artGrade;
    }
    /*
    Setters - Public methods to modify the grade information
     */

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    public void setSpanishGrade(int spanishGrade) {
        this.spanishGrade = spanishGrade;
    }

    public void setHistoryGrade(int historyGrade) {
        this.historyGrade = historyGrade;
    }

    public void setPhysicsGrade(int physicsGrade) {
        this.physicsGrade = physicsGrade;
    }

    public void setBiologyGrade(int biologyGrade) {
        this.biologyGrade = biologyGrade;
    }

    public void setGymGrade(int gymGrade) {
        this.gymGrade = gymGrade;
    }

    public void setArtGrade(int artGrade) {
        this.artGrade = artGrade;
    }
}
