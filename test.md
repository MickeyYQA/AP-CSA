# Solving the Fourth-Order Linear Homogeneous Differential Equation

The differential equation 

\[ y^{(4)} + y = 0 \]

is a fourth-order linear homogeneous differential equation. To solve it, follow these steps:

---

## Step 1: Write the Characteristic Equation

Assume a solution of the form \( y = e^{rt} \). Substituting this into the differential equation gives:

\[
r^4 + 1 = 0
\]

---

## Step 2: Solve the Characteristic Equation

The equation \( r^4 + 1 = 0 \) can be written as:

\[
r^4 = -1
\]

The fourth roots of \(-1\) are:

\[
r = e^{i\pi/4}, \, e^{i3\pi/4}, \, e^{i5\pi/4}, \, e^{i7\pi/4}
\]

These correspond to:

\[
r = \pm \frac{\sqrt{2}}{2} + i \frac{\sqrt{2}}{2}, \quad r = \pm \frac{\sqrt{2}}{2} - i \frac{\sqrt{2}}{2}.
\]

---

## Step 3: Write the General Solution

The general solution to the differential equation is a linear combination of terms based on the roots of the characteristic equation. Using Euler’s formula \( e^{i\theta} = \cos\theta + i\sin\theta \), we express the solutions as trigonometric functions:

\[
y(t) = C_1 \cos\left(\frac{\sqrt{2}}{2} t\right) + C_2 \sin\left(\frac{\sqrt{2}}{2} t\right) + C_3 \cos\left(-\frac{\sqrt{2}}{2} t\right) + C_4 \sin\left(-\frac{\sqrt{2}}{2} t\right).
\]

Since \( \cos(-x) = \cos(x) \) and \( \sin(-x) = -\sin(x) \), this simplifies to:

\[
y(t) = C_1 \cos\left(\frac{\sqrt{2}}{2} t\right) + C_2 \sin\left(\frac{\sqrt{2}}{2} t\right) + C_3 \cos\left(\frac{\sqrt{2}}{2} t\right) - C_4 \sin\left(\frac{\sqrt{2}}{2} t\right).
\]

Combine terms to get:

\[
y(t) = (C_1 + C_3) \cos\left(\frac{\sqrt{2}}{2} t\right) + (C_2 - C_4) \sin\left(\frac{\sqrt{2}}{2} t\right).
\]

Finally, rename constants:

\[
y(t) = A \cos\left(\frac{\sqrt{2}}{2} t\right) + B \sin\left(\frac{\sqrt{2}}{2} t\right).
\]

---

## General Solution

\[
y(t) = A \cos\left(\frac{\sqrt{2}}{2} t\right) + B \sin\left(\frac{\sqrt{2}}{2} t\right),
\]

where \( A \) and \( B \) are arbitrary constants.