Mandelbrot Set
==============

Mandelbrot set drawing with 2x zoom after mouse click.  

![](https://raw.github.com/dreambrother/math-experiments/master/_screenshots/mandelbrot-set/Screenshot%20from%202012-12-03%2023:28:56.png)

![](https://raw.github.com/dreambrother/math-experiments/master/_screenshots/mandelbrot-set/Screenshot%20from%202012-12-03%2023:29:47.png)

![](https://raw.github.com/dreambrother/math-experiments/master/_screenshots/mandelbrot-set/Screenshot%20from%202012-12-03%2023:30:21.png)

![](https://raw.github.com/dreambrother/math-experiments/master/_screenshots/mandelbrot-set/Screenshot%20from%202012-12-03%2023:31:01.png)


Turing Machine
==============

Turing Machine described in Roger Penrose's book "The Emperor's New Mind".  
Test example contains unary number redouble algorithm:  
```java
Map<String, String> algorithm = new HashMap<String, String>() {
    {
        put("00", "00R");
        put("01", "10R");
        put("10", "101L");
        put("11", "11R");
        put("100", "110R");
        put("101", "1000R");
        put("110", "01S");
        put("111", "111R");
        put("1000", "1011L");
        put("1001", "1001R");
        put("1010", "101L");
        put("1011", "1011L");
    }
};
```

