<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tugas 1 Menghitung sisa Pembagian (setya)</title>
</head>
<body>
     <h2>Hitung Sisa Pembagian</h2>
    <?php
        $angka1 = $_POST['angka1'];
        $angka2 = $_POST['angka2'];

        if ($angka2 != 0) {
            $hasil = $angka1 % $angka2;
            echo "$angka1 % $angka2 = $hasil";
        } else {
            echo "Angka 2 tidak boleh nol!";
        }
    ?>
</body>
</html>