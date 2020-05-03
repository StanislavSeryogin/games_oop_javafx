package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        Cell cell = Cell.A1;
        BishopBlack bishop = new BishopBlack(cell);
        assertThat(bishop.position(), is(cell));
    }

    @Test
    public void copy() {
        Cell cell = Cell.A1;
        Cell cellCopy = Cell.B2;
        Figure bishop = new BishopBlack(cell).copy(cellCopy);
        assertThat(bishop.position(), is(cellCopy));
    }

    @Test
    public void way() {
        Cell source = Cell.C1;
        Cell dest = Cell.G5;
        assertThat(new BishopBlack(source).way(source, dest), is(new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }
}