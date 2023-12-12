class Main {
  public static void main(String[] args) {
    //inserire parola chiave
    String parolaChiave;
    System.out.println("Inserisci la parola chiave:");
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      parolaChiave = br.readLine();
    }
    catch (IOException){
      System.err.println("Errore lettura dati da tastiera");
    }
    System.out.println("Cifriamo il nostro testo e trasformiamolo in un testo segreto!");
    Matrice m = new Matrice("TPSIT");
    Vigenere v = new Vigenere(0, 12, 0, 12, m);
    Thread t = new Thread(v);
    t.start();
  }
}
