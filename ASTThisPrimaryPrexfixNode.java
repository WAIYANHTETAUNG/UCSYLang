/* Generated By:JJTree: Do not edit this line. ASTThisPrimaryPrexfixNode.java */

public class ASTThisPrimaryPrexfixNode extends SimpleNode {
  public ASTThisPrimaryPrexfixNode(int id) {
    super(id);
  }

  public ASTThisPrimaryPrexfixNode(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
