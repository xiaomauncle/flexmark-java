package org.commonmark.node;

/**
 * Abstract visitor that visits all children by default.
 * <p/>
 * Can be used to only process certain nodes. If you override a method and want visiting to descend into children,
 * call {@link #visitChildren}.
 */
public abstract class AbstractVisitor implements Visitor {

    @Override
    public void visit(BlockQuote blockQuote) {
        visitChildren(blockQuote);
    }

    @Override
    public void visit(BulletList bulletList) {
        visitChildren(bulletList);
    }

    @Override
    public void visit(Code code) {
        visitChildren(code);
    }

    @Override
    public void visit(Document document) {
        visitChildren(document);
    }

    @Override
    public void visit(Emphasis emphasis) {
        visitChildren(emphasis);
    }

    @Override
    public void visit(FencedCodeBlock fencedCodeBlock) {
        visitChildren(fencedCodeBlock);
    }

    @Override
    public void visit(HardLineBreak hardLineBreak) {
        visitChildren(hardLineBreak);
    }

    @Override
    public void visit(Header header) {
        visitChildren(header);
    }

    @Override
    public void visit(HorizontalRule horizontalRule) {
        visitChildren(horizontalRule);
    }

    @Override
    public void visit(HtmlTag htmlTag) {
        visitChildren(htmlTag);
    }

    @Override
    public void visit(HtmlBlock htmlBlock) {
        visitChildren(htmlBlock);
    }

    @Override
    public void visit(Image image) {
        visitChildren(image);
    }

    @Override
    public void visit(IndentedCodeBlock indentedCodeBlock) {
        visitChildren(indentedCodeBlock);
    }

    @Override
    public void visit(Link link) {
        visitChildren(link);
    }

    @Override
    public void visit(ListItem listItem) {
        visitChildren(listItem);
    }

    @Override
    public void visit(OrderedList orderedList) {
        visitChildren(orderedList);
    }

    @Override
    public void visit(Paragraph paragraph) {
        visitChildren(paragraph);
    }

    @Override
    public void visit(SoftLineBreak softLineBreak) {
        visitChildren(softLineBreak);
    }

    @Override
    public void visit(StrongEmphasis strongEmphasis) {
        visitChildren(strongEmphasis);
    }

    @Override
    public void visit(Text text) {
        visitChildren(text);
    }

    /**
     * Visit the child nodes.
     *
     * @param node the parent node whose children should be visited
     */
    protected void visitChildren(Node node) {
        Node child = node.getFirstChild();
        while (child != null) {
            child.accept(this);
            child = child.getNext();
        }
    }
}
