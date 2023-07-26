import { Directive, HostBinding, HostListener } from "@angular/core";
import { ElementRef } from "@angular/core";

@Directive({
    selector: '[addColor]'
})

export class AddColorDirective {

    constructor(private elementRef: ElementRef) {
        this.elementRef.nativeElement.style.backgroundColor = 'red';
    }

    @HostListener('mouseover')
    onMouseover() {
        this.bgColor = 'purple';
    }

    @HostListener('mouseleave')
    onMouseleave() {
        this.bgColor = 'green';
    }

    @HostBinding('style.backgroundColor') bgColor: string = "";

}