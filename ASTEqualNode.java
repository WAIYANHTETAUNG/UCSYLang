/* Generated By:JJTree: Do not edit this line. ASTEqualNode.java */

public class ASTEqualNode extends ParentExpression {
	ParentExpression opOne;
	ParentExpression opTwo;
  public ASTEqualNode(int id) {
    super(id);
  }

  public ASTEqualNode(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}