# pertanyaannya adalah: 
1. pada konteks web development, maven membantu dari sisi apa?

jawab:

proposisi:
1. file *.class harus masuk ke folder WEB-INF/classes
2. jika file *.java butuh servlet, maka kita membutuhkan *.jar servlet dalam proses kompilasi.

maka kita harus jalankan command:

`javac -classpath servlet.jar -d WEB-INF/classes src/*.java`    

maka proses maven harus disesuaikan dengan lifecycle java server 

# java servlet, sebenarnya masih belum pakai maven juga ga apa-apa
lebih baik buat barus saja saja, tiru youtube agar mudah