public class MathTeacher implements ITeacher {
    private WisdomWordsService wisdomService;
    private HomeworkService homeworkService;
    private static final String MATH_TEACHER_PREFIX = "Math teacher says: "; //static final cu litere mari
    //public MathTeacher(){};

    @Override
    public String getHomework() {
        return homeworkService.getMessage();
    }

    @Override
    public String getWisdom() {
        return MATH_TEACHER_PREFIX + wisdomService.getMessage();
    }

    public void setWisdomService(WisdomWordsService wisdomService) {
        this.wisdomService = wisdomService;
    }

}
