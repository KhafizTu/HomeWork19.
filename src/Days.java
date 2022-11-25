public enum Days {

    MONDAY("Дуйшомбу куну Java окуйм"),
    TUESDAY("Шейшемби күнү English сабагын окуйм"),
    WEDNESDAY("Шаршенби куну Talking club болот"),
    THURSDAY("Бейшемби куну Practice Lesson окуйм"),
    FRIDAY("Жума куну Event жана  Technical Lesson болот"),
    SATURDAY("Ишемби куну  ДЕМ АЛЫШ"),
    SUNDAY("Жекшемби куну ДЕМ АЛЫШ");
    private String raspisanie;

    Days(String raspisanie){
        this.raspisanie=raspisanie;
    }
    public String getRaspisanie(){
        return raspisanie;
    }

}
