package org.codes.java.java17;

public sealed class Subjects permits Mathematics,Physics,Chemistry,Biology,Hindi,Malayalam {
}
sealed class Mathematics  extends Subjects permits AppliedMathematics {

}
sealed class Physics extends Subjects permits AppliedPhysics,TheorticalPhysics{

}
final class AppliedMathematics  extends  Mathematics{

}
sealed class Chemistry extends Subjects permits AppliedChemistry
{

}
final class Biology extends Subjects{

}
final class AppliedPhysics extends Physics{

}
final class TheorticalPhysics extends Physics{

}
final class Malayalam extends Subjects{

}
final class Hindi extends Subjects{

}
final class AppliedChemistry extends Chemistry{

}