/* Generated By:JJTree: Do not edit this line. ASTThisNode.java */

public class ASTThisNode extends SimpleNode {
  public ASTThisNode(int id) {
    super(id);
  }

  public ASTThisNode(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
