class BodyPosition{
    public static void main(String args[]){
// ��������� ���������� �������:
        double g=9.8;
// ����� "��":
        double pi=3.141592;
// ���� � ��������� (� ��������):
        double alpha=30;
// ����� ���� (� �����������):
        double m=0.1;
// ����������� ������������� ������� (� �*�/�):
        double gamma=0.1;
// �������� ���� (� �/�):
        double V=100.0;
// ����� (� ��������):
        double t=1.0;
// ���������� ���� (� ������):
        double x,y;
// ������� �������� � �������:
        alpha/=180/pi;
        // ���������� ���������:
        x=V*m*Math.cos(alpha)/gamma*(1-Math.exp(-gamma*t/m));
        y=m*(V*Math.sin(alpha)*gamma+m*gamma)/gamma/gamma*(1-Math.exp(-gamma*t/m))-m*g*t/
                gamma;
// ����� ���������� �� �����:
        System.out.println("���������� ���� ��� t="+t+" ���:\nx="+x+" �\ny="+y+" �");
        System.out.println("���������:");
        System.out.println("���� alpha="+alpha/pi*180+" ��������");
        System.out.println("�������� V="+V+" �/�");
        System.out.println("����������� ������������� gamma="+gamma+" �*�/�");
        System.out.println("����� ���� m="+m+" ��");
    }}