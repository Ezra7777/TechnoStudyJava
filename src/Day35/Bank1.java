package Day35;

class Bank1 {
    private String privateInfo() {
        return "private info: CEO is Max";
    }

    public String publicInfo() {
        String var = "";
        String publicInfo = "Name is: Chase \n" + var;

        return publicInfo;// + privateInfo;
    }
}

