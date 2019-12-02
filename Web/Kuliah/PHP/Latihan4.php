<HTML>
    <head>
        <title> IF DATE </title>
    </head>
    
    <body>
        <?php
            $kode_hari = date("w");
            $haris = array("Minggu","Senin","Selasa","Rabu","Kamis","Jum'at","Sabtu");
            printf("Dengan Array - $haris[$kode_hari] <BR>");

            print("Dengan IF - ");
            if($kode_hari == 0)
                print("Minggu");
            elseif($kode_hari == 1)
                print("Senin");
            elseif($kode_hari == 2)
                print("Selasa");
            elseif($kode_hari == 3)
                print("Rabu");
            elseif($kode_hari == 4)
                print("Kamis");
            elseif($kode_hari == 5)
                print("Jum'at");
            else
                print("Sabtu");
            
            print("<BR>Dengan Switch - ");
            switch($kode_hari){
                case 0:
                    print("Minggu");
                    break;
                case 1:
                    print("Senin");
                    break;
                case 2:
                    print("Selasa");
                    break;
                case 3:
                    print("Rabu");
                    break;
                case 4:
                    print("Kamis");
                    break;
                case 5:
                    print("Jum'at");
                    break;
                case 6:
                    print("Sabtu");
                    break;
            }
        ?>
    </body>
</HTML>