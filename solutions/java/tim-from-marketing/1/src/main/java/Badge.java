class Badge {
    public String print(Integer id, String name, String department) {
        String ids;
        if (id != null){
            ids = "[" + id + "] - ";
        } else {
            ids = "";
        }
        if (department == null){
            department = "OWNER";
        }
        return ids + name + " - " + department.toUpperCase();
    }
}
