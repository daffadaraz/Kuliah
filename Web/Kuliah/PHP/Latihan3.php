<HTML>
    <head>
        <title> Conversi dengan cast </title>
    </head>
    
    <body>
        <?php
            $berat = "40.5 kg";
            print("Tipe String  : $berat <BR>");
            printf("Tipe Double  : %s <BR>", (double) $berat);
            printf("Tipe Integer  : %s <BR>", (int) $berat);
            printf("Tipe String  : %s <BR>", $berat);
            
            $bilangan = 28;
            $berat = (String) $bilangan;
            printf("Bil. ke String : %s <BR>", $berat);
        ?>
    </body>
</HTML>