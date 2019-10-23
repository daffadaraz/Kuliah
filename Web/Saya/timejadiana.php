<!DOCTYPE php>

<html>
    <head>
        <title> Daffa dan Ratu </title>
        <h1 align=center> Daffa dan Ratu </h1>
    </head>

    <body align=center>
        <span>
            <?PHP
                echo shell_exec("python3 TimeJadian.py");
            ?>
        </span>

        <br><br>

        <button> YAY </button>
        <a href="/">
            <button> Back </button>
        </a>
    </body>
</html>