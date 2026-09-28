class BSTIterator:
  def __init__(self, root: TreeNode | None):
    self.i = 0
    self.vals = []
    self._inorder(root)

  def next(self) -> int:
    self.i += 1
    return self.vals[self.i - 1]

  def hasNext(self) -> bool:
    return self.i < len(self.vals)

  def _inorder(self, root: TreeNode | None) -> None:

