import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SortingPanel extends JPanel {
    
    private static final long serialVersionUID = 1L;

    private Random random;
    private int[] array;
    private BubbleSort bubbleSort;
    private InsertionSort insertionSort;
    private SelectionSort selectionSort;
    private QuickSort quickSort;
    private MergeSort mergeSort;
    private HeapSort heapSort;
    private CountingSort countingSort;

    private JButton start;
    private JButton bubble;
    private JButton insertion;
    private JButton selection;
    private JButton quick;
    private JButton heap;
    private JButton merge;
    private JButton counting;
    private JButton reset;

    private boolean isBubble = false;
    private boolean isInsertion = false;
    private boolean isSelection = false;
    private boolean isQuick = false;
    private boolean isHeap = false;
    private boolean isMerge = false;
    private boolean isCounting = false;

    private boolean isRunning;

    Color purple = new Color(70, 25, 89);
    Color magenta = new Color(122, 49, 111);
    Color pink = new Color(205, 102, 136);
    Color teal = new Color(174, 216, 204);

    int i = 0;

    public SortingPanel() {

        random = new Random();
        array = new int[80];
        this.setArray();

        bubbleSort = new BubbleSort(array);
        insertionSort = new InsertionSort(array);
        selectionSort = new SelectionSort(array);
        quickSort = new QuickSort(array);
        mergeSort = new MergeSort(array);
        heapSort = new HeapSort(array);
        countingSort = new CountingSort(array);

        start = new JButton("start");
        bubble = new JButton("bubble");
        insertion = new JButton("insertion");
        selection = new JButton("selection");
        quick = new JButton("quick");
        merge = new JButton("merge");
        heap = new JButton("heap");
        counting = new JButton("counting");
        reset = new JButton("reset");

        start.setModel(new ButtonModel());
        start.setBackground(Color.WHITE);
        start.setFocusPainted(false);
        start.setBorderPainted(false);

        

        start.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) { 
                try {
                    start.setBackground(teal);
                    if (isRunning == false)
                        isRunning = true;
                        animate();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            } 
        });

        bubble.setModel(new ButtonModel());
        bubble.setBackground(Color.WHITE);
        bubble.setFocusPainted(false);
        bubble.setBorderPainted(false);
        bubble.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) { 
                try {
                    if (isRunning == false) {
                        isInsertion = false;
                        isSelection = false;
                        isQuick = false;
                        isBubble = true;
                        isHeap = false;
                        isMerge = false;
                        isCounting = false;
                        setButtonBackground();
                        bubble.setBackground(teal);
                    }   
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            } 
        });

        insertion.setModel(new ButtonModel());
        insertion.setBackground(Color.WHITE);
        insertion.setFocusPainted(false);
        insertion.setBorderPainted(false);
        insertion.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) { 
                try {
                    if (isRunning == false) {
                        isInsertion = true;
                        isSelection = false;
                        isQuick = false;
                        isBubble = false;
                        isHeap = false;
                        isMerge = false;
                        isCounting = false;
                        setButtonBackground();
                        insertion.setBackground(teal);
                    } 
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            } 
        });

        selection.setModel(new ButtonModel());
        selection.setBackground(Color.WHITE);
        selection.setFocusPainted(false);
        selection.setBorderPainted(false);
        selection.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) { 
                try {
                    if (isRunning == false) {
                        isInsertion = false;
                        isSelection = true;
                        isQuick = false;
                        isBubble = false;
                        isHeap = false;
                        isMerge = false;
                        isCounting = false;
                        setButtonBackground();
                        selection.setBackground(teal);
                    } 
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            } 
        });

        quick.setModel(new ButtonModel());
        quick.setBackground(Color.WHITE);
        quick.setFocusPainted(false);
        quick.setBorderPainted(false);
        quick.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) { 
                try {
                    if (isRunning == false) {
                        isInsertion = false;
                        isSelection = false;
                        isQuick = true;
                        isBubble = false;
                        isHeap = false;
                        isMerge = false;
                        isCounting = false;
                        setButtonBackground();
                        quick.setBackground(teal);
                    }   
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            } 
        });

        counting.setModel(new ButtonModel());
        counting.setBackground(Color.WHITE);
        counting.setFocusPainted(false);
        counting.setBorderPainted(false);
        counting.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) { 
                try {
                    if (isRunning == false) {
                        isInsertion = false;
                        isSelection = false;
                        isQuick = false;
                        isBubble = false;
                        isHeap = false;
                        isMerge = false;
                        isCounting = true;
                        setButtonBackground();
                        counting.setBackground(teal);
                    }   
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            } 
        });

        heap.setModel(new ButtonModel());
        heap.setBackground(Color.WHITE);
        heap.setFocusPainted(false);
        heap.setBorderPainted(false);
        heap.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) { 
                try {
                    if (isRunning == false) {
                        isInsertion = false;
                        isSelection = false;
                        isQuick = false;
                        isBubble = false;
                        isHeap = true;
                        isMerge = false;
                        isCounting = false;
                        setButtonBackground();
                        heap.setBackground(teal);
                    }   
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            } 
        });

        merge.setModel(new ButtonModel());
        merge.setBackground(Color.WHITE);
        merge.setFocusPainted(false);
        merge.setBorderPainted(false);
        merge.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) { 
                try {
                    if (isRunning == false) {
                        isInsertion = false;
                        isSelection = false;
                        isQuick = false;
                        isBubble = false;
                        isHeap = false;
                        isMerge = true;
                        isCounting = false;
                        setButtonBackground();
                        merge.setBackground(teal);
                    }   
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            } 
        });

        reset.setModel(new ButtonModel());
        reset.setBackground(Color.WHITE);
        reset.setFocusPainted(false);
        reset.setBorderPainted(false);
        reset.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) { 

                reset.setBackground(teal);
                start.setBackground(Color.WHITE);

                setArray();

                // reset bubbleSort object
                bubbleSort.setCompareIndex(Integer.MAX_VALUE);
                bubbleSort.setArrayIndex(0);
                bubbleSort.setArray(array);

                // reset insertionSort object
                insertionSort.setCompareIndex(Integer.MAX_VALUE);
                insertionSort.setArrayIndex(Integer.MAX_VALUE);
                insertionSort.setArray(array);
                insertionSort.setStartOfIteration(false);

                // reset quickSort object
                quickSort.setSP(-1);
                quickSort.push(0);
                quickSort.push(79);
                quickSort.setArrayIndex(Integer.MAX_VALUE);
                quickSort.setCompareIndex(Integer.MAX_VALUE);
                quickSort.setPartition(-1);
                quickSort.setIsPartioning(false);

                // reset counting object
                countingSort.setArrayIndex(0);
                countingSort.setArray(array);

                isRunning = false;
                
                Timer timer  = new Timer(100, new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        reset.setBackground(Color.WHITE);
                        ((Timer)e.getSource()).stop();
                    }
                });

                timer.start();
                repaint();
            } 
        });

        this.add(start);
        this.add(bubble);
        this.add(insertion);
        this.add(selection);
        this.add(quick);
        this.add(merge);
        this.add(counting);
        this.add(heap);
        this.add(reset);
    }

    public void setButtonBackground() {
        bubble.setBackground(Color.WHITE);
        insertion.setBackground(Color.WHITE);
        selection.setBackground(Color.WHITE);
        quick.setBackground(Color.WHITE);
        counting.setBackground(Color.WHITE);
        heap.setBackground(Color.WHITE);
        merge.setBackground(Color.WHITE);
    }

    public int[] getArray() {
        return this.array;
    }

    public void setArray() {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = random.nextInt(510) + 40;
        }
    }

    public boolean isSorted() {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false; 
            }
        }
    
        return true;
    }

    public void animate() throws Exception{

        if (isBubble) {

            bubbleSort.setCompareIndex(0);

            Timer bubbleTimer  = new Timer(10, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (isSorted() || isRunning == false) {
                        bubbleSort.setCompareIndex(Integer.MAX_VALUE);
                        isRunning = false;
                        start.setBackground(Color.WHITE);
                        ((Timer)e.getSource()).stop();
                    } 
                    else {
                        if (isRunning == true)
                            array = bubbleSort.sortOnlyOneItem();
                    }

                    repaint();
                }
            });

            bubbleTimer.start();
        }
        
        if (isInsertion) {

            insertionSort.setArrayIndex(1);

            Timer insertionTimer  = new Timer(10, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (isSorted() || isRunning == false) {
                        insertionSort.setCompareIndex(Integer.MAX_VALUE);
                        insertionSort.setArrayIndex(Integer.MAX_VALUE);
                        insertionSort.setStartOfIteration(false);
                        isRunning = false;
                        start.setBackground(Color.WHITE);
                        ((Timer)e.getSource()).stop();
                    } 
                    else {
                        if (isRunning == true)
                            array = insertionSort.sortOnlyOneItem();
                    }

                    repaint();
                }
            });

            insertionTimer.start();
        }


        {

            selectionSort.setArrayIndex(0);
            selectionSort.setCompareIndex(1);
            selectionSort.setMinIdx(0);

            Timer selectionTimer  = new Timer(10, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (isSorted() || isRunning == false) {
                        selectionSort.setCompareIndex(Integer.MAX_VALUE);
                        selectionSort.setArrayIndex(Integer.MAX_VALUE);
                        selectionSort.setMinIdx(Integer.MAX_VALUE);
                        isRunning = false;
                        start.setBackground(Color.WHITE);
                        ((Timer)e.getSource()).stop();
                    } 
                    else {
                        if (isRunning == true)
                            array = selectionSort.sortOnlyOneItem();
                    }

                    repaint();
                }
            });

            selectionTimer.start();
        }

        if (isQuick) {

            Timer quickTimer  = new Timer(10, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (isSorted() || isRunning == false) {
                        quickSort.setSP(-1);
                        quickSort.push(0);
                        quickSort.push(79);
                        quickSort.setArrayIndex(Integer.MAX_VALUE);
                        quickSort.setCompareIndex(Integer.MAX_VALUE);
                        quickSort.setPartition(-1);
                        quickSort.setIsPartioning(false);
                        isRunning = false;
                        start.setBackground(Color.WHITE);
                        ((Timer)e.getSource()).stop();
                    } 

                    else {
                        if (isRunning == true)
                            array = quickSort.sortOnlyOneItem();
                    }

                    repaint();
                }
            });

            quickTimer.start();
        }

        if (isCounting) {

            Timer countingTimer  = new Timer(10, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (isSorted() || isRunning == false) {
                        // countingSort.setSP(-1);
                        // countingSort.push(0);
                        // countingSort.push(79);
                        countingSort.setArrayIndex(Integer.MAX_VALUE);
                        countingSort.setCompareIndex(Integer.MAX_VALUE);
                        // countingSort.setPartition(-1);
                        // countingSort.setIsPartioning(false);
                        isRunning = false;
                        start.setBackground(Color.WHITE);
                        ((Timer)e.getSource()).stop();
                    } 

                    else {
                        if (isRunning == true)
                            array = countingSort.sortOnlyOneItem();
                    }

                    repaint();
                }
            });

            countingTimer.start();
        }
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        this.setBackground(purple);

        for (int i = 0; i < array.length; i++) {
            
            g.setColor(Color.BLACK);
            g.drawRect(i*15, 600 - array[i], 14, array[i]); 
            
            if (isBubble) {

                if (i == bubbleSort.getCompareIndex() || i == (bubbleSort.getCompareIndex() + 1)) {
                    g.setColor(teal);
                }

            }

            if (isCounting) {

                if (i == countingSort.getCompareIndex() || i == (countingSort.getCompareIndex() + 1)) {
                    g.setColor(teal);
                }

            }

            if (isHeap) {

                if (i == heapSort.getCompareIndex() || i == (heapSort.getCompareIndex() + 1)) {
                    g.setColor(teal);
                }

            }

            if (isMerge) {

                if (i == mergeSort.getCompareIndex() || i == (mergeSort.getCompareIndex() + 1)) {
                    g.setColor(teal);
                }

            }

            if (isInsertion) {

                if (i == insertionSort.getCompareIndex() || i == (insertionSort.getCompareIndex() + 1)) {
                    g.setColor(magenta);
                }

                if (i == insertionSort.getArrayIndex()) {
                    g.setColor(Color.GREEN);
                }
            }

            if (isSelection) {

                if (i == selectionSort.getCompareIndex() || i == selectionSort.getMinIdx()) {
                    g.setColor(magenta);
                }

                if (i == selectionSort.getArrayIndex()) {
                    g.setColor(Color.GREEN);
                }
            }

            if (isQuick) {
                
                if (i == quickSort.getArrayIndex()) {
                    g.setColor(magenta);
                }

                if (i == quickSort.getCompareIndex()) {
                    g.setColor(Color.BLUE);
                }

                if (i == quickSort.getPartition())
                    g.setColor(Color.GREEN);
            }
        
            if (g.getColor() != teal && g.getColor() != pink && g.getColor() != Color.GREEN && g.getColor() != Color.BLUE)
                g.setColor(magenta);

            g.fillRect(i*15, 600 - array[i], 14, array[i]);
        }
    }
}
