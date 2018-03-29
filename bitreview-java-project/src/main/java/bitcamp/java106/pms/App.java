    
    private ArrayList teamCollection = new ArrayList();
    private ArrayList memberCollection = new ArrayList();
    
    private int getIndex(String teamName, String memberId) {
        String ptn = teamName.toLowerCase();
        String pmi = memberId.toLowerCase();
        for (int i = 0; i < teamCollection.size(); i++) {
            String tn = teamCollection.get(i).toString().toLowerCase();
            String mi = memberCollection.get(i).toString().toLowerCase();
            if (tn.equals(ptn) && mi.equals(pmi)) {
                return i;
            }
        }
        return -1;
    }


    String tn = teamCollection.get(i).toString().toLowerCase();
    String tn = ((String)teamCollection.get(i)).toString().toLowerCase();

    